package com.example.testspringboot.service;


import com.example.testspringboot.model.Component;
import com.example.testspringboot.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentServiceImpl implements ComponentService {

    @Autowired
    private ComponentRepository componentRepository;

    @Override
    public void create(Component component) {
        componentRepository.save(component);
    }

    @Override
    public List<Component> readAll() {
        return componentRepository.findAll();
    }

    @Override
    public Component read(int id) {
        return componentRepository.getById(id);
    }

    @Override
    public boolean update(Component component, int id) {
        if (componentRepository.existsById(id)) {
            component.setId(id);
            componentRepository.save(component);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (componentRepository.existsById(id)) {
            componentRepository.deleteById(id);
            return true;
        }
        return false;
    }


}