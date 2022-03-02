package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Strings;
import fi.vamk.e2001365.northwind.service.StringsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringsController {
    @Autowired
    private StringsService StringsService;

    @GetMapping("")
    public ResponseEntity<Iterable<Strings>> getAllStrings(){
        return StringsService.getAllStrings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Strings> getStrings(@PathVariable("id") Integer id){
        return StringsService.getStrings(id);
    }

    @PostMapping("")
    public ResponseEntity<Strings> postStrings(@RequestBody Strings strings){
        return StringsService.postStrings(strings);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Strings> updateStrings(@RequestBody Strings strings, @PathVariable("id") Integer id){
        return StringsService.updateStrings(id, strings);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Strings> deleteStrings(@PathVariable("id") Integer id){
        return StringsService.deleteStrings(id);
    }
}
