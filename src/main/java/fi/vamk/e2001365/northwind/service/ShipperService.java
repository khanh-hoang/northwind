package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Shipper;
import fi.vamk.e2001365.northwind.repository.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShipperService {
    @Autowired
    private ShipperRepository ShipperRepository;

    public ResponseEntity<Iterable<Shipper>> getAllShipper(){
        return ResponseEntity.ok(ShipperRepository.findAll());
    }

    public ResponseEntity<Shipper> getShipper(Integer id) {
        if (ShipperRepository.existsById(id))
            return ResponseEntity.ok(ShipperRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Shipper> postShipper(Shipper shipper){
        if (ShipperRepository.existsById(shipper.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(ShipperRepository.save(shipper));
    }

    public ResponseEntity<Shipper> updateShipper(Integer id, Shipper shipper){
        shipper.setId(id);
        if (ShipperRepository.existsById(id))
            return ResponseEntity.ok(ShipperRepository.save(shipper));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteShipper(Integer id){
        if (ShipperRepository.existsById(id)){
            ShipperRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
