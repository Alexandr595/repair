package com.repair.lockerrepair.service;

import com.repair.lockerrepair.model.AttachedFile;
import com.repair.lockerrepair.service.common.CrudService;
import com.repair.lockerrepair.service.common.DefaultServiceImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AttachedFileService extends DefaultServiceImplementation<AttachedFile, Long> implements CrudService<AttachedFile, Long> {
    public AttachedFileService(CrudRepository<AttachedFile, Long> repo) {
        super(repo);
    }

    public Long saveWithData(byte[] data, String name, String contentType) {
        AttachedFile attachedFile = new AttachedFile();
        attachedFile.setData(data);
        attachedFile.setName(name);
        attachedFile.setContentType(contentType);
        return save(attachedFile).getId();
    }
}
