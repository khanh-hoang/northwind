package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Privilege;
import fi.vamk.e2001365.northwind.repository.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService {
    @Autowired
    private PrivilegeRepository PrivilegeRepository;

    public ResponseEntity<Iterable<Privilege>> getAllPrivilege(){
        return ResponseEntity.ok(PrivilegeRepository.findAll());
    }

    public ResponseEntity<Privilege> getPrivilege(Integer id) {
        if (PrivilegeRepository.existsById(id))
            return ResponseEntity.ok(PrivilegeRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Privilege> postPrivilege(Privilege privilege){
        if (PrivilegeRepository.existsById(privilege.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(PrivilegeRepository.save(privilege));
    }

    public ResponseEntity<Privilege> updatePrivilege(Integer id, Privilege privilege){
        privilege.setId(id);
        if (PrivilegeRepository.existsById(id))
            return ResponseEntity.ok(PrivilegeRepository.save(privilege));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deletePrivilege(Integer id){
        if (PrivilegeRepository.existsById(id)){
            PrivilegeRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
