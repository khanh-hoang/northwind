package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Shipper;
import fi.vamk.e2001365.northwind.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipper")
public class ShipperController {
    @Autowired
    private ShipperService ShipperService;

    @GetMapping("")
    public ResponseEntity<Iterable<Shipper>> getAllShipper(){
        return ShipperService.getAllShipper();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shipper> getShipper(@PathVariable("id") Integer id){
        return ShipperService.getShipper(id);
    }

    @PostMapping("")
    public ResponseEntity<Shipper> postShipper(@RequestBody Shipper shipper){
        return ShipperService.postShipper(shipper);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shipper> updateShipper(@RequestBody Shipper shipper, @PathVariable("id") Integer id){
        return ShipperService.updateShipper(id, shipper);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Shipper> deleteShipper(@PathVariable("id") Integer id){
        return ShipperService.deleteShipper(id);
    }
}
