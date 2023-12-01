package com.repair.lockerrepair.controller;

import com.repair.lockerrepair.controller.common.CrudController;
import com.repair.lockerrepair.model.AttachedFile;
import com.repair.lockerrepair.service.AttachedFileService;
import com.repair.lockerrepair.service.common.CrudService;
import jdk.jfr.ContentType;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.activation.MimetypesFileTypeMap;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/file")
public class AttachedFileController extends CrudController<AttachedFile, Long> {

    private final AttachedFileService attachedFileService;

    public AttachedFileController(CrudService<AttachedFile, Long> service) {
        super(service);
        attachedFileService = (AttachedFileService) service;
    }

    @PostMapping("/upload")
    public String upload(@RequestParam List<MultipartFile> files) throws IOException {
        String result = "";
        for(MultipartFile file: files) {
            result += attachedFileService.saveWithData(file.getBytes(), file.getOriginalFilename(), file.getContentType()) + ",";
        }
        return result.substring(0, result.length() - 1);
    }

    @GetMapping(value = "/{id}", produces = { "application/octet-stream" })
    public ResponseEntity<byte[]> get(@PathVariable String id) {
        Long lId = Long.valueOf(id);
        Optional<AttachedFile> file = attachedFileService.findById(lId);

        HttpHeaders respHeaders = new HttpHeaders();
        respHeaders.setContentType(/*MediaType.parseMediaType(file.get().getContentType())*/MediaType.APPLICATION_OCTET_STREAM);
        respHeaders.setContentLength(file.get().getData().length);
        respHeaders.setContentDisposition(ContentDisposition.attachment().filename(file.get().getName()).build());

        return new ResponseEntity<byte[]>(file.get().getData(), respHeaders, HttpStatus.OK);
    }
}
