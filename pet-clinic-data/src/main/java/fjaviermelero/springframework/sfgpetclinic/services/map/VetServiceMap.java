package fjaviermelero.springframework.sfgpetclinic.services.map;

import fjaviermelero.springframework.sfgpetclinic.model.Vet;
import fjaviermelero.springframework.sfgpetclinic.services.CrudService;
import fjaviermelero.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
