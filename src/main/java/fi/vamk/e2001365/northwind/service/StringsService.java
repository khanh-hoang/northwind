package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Strings;
import fi.vamk.e2001365.northwind.repository.StringsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StringsService {
    @Autowired
    private StringsRepository StringsRepository;

    public ResponseEntity<Iterable<Strings>> getAllStrings(){
        return ResponseEntity.ok(StringsRepository.findAll());
    }

    public ResponseEntity<Strings> getStrings(Integer id) {
        if (StringsRepository.existsById(id))
            return ResponseEntity.ok(StringsRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Strings> postStrings(Strings strings){
        if (StringsRepository.existsById(strings.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(StringsRepository.save(strings));
    }

    public ResponseEntity<Strings> updateStrings(Integer id, Strings strings){
        strings.setId(id);
        if (StringsRepository.existsById(id))
            return ResponseEntity.ok(StringsRepository.save(strings));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteStrings(Integer id){
        if (StringsRepository.existsById(id)){
            StringsRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
