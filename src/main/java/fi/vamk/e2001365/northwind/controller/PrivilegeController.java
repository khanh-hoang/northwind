package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Privilege;
import fi.vamk.e2001365.northwind.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/privilege")
public class PrivilegeController {
    @Autowired
    private PrivilegeService PrivilegeService;

    @GetMapping("")
    public ResponseEntity<Iterable<Privilege>> getAllPrivilege(){
        return PrivilegeService.getAllPrivilege();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Privilege> getPrivilege(@PathVariable("id") Integer id){
        return PrivilegeService.getPrivilege(id);
    }

    @PostMapping("")
    public ResponseEntity<Privilege> postPrivilege(@RequestBody Privilege privilege){
        return PrivilegeService.postPrivilege(privilege);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Privilege> updatePrivilege(@RequestBody Privilege privilege, @PathVariable("id") Integer id){
        return PrivilegeService.updatePrivilege(id, privilege);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Privilege> deletePrivilege(@PathVariable("id") Integer id){
        return PrivilegeService.deletePrivilege(id);
    }
}
