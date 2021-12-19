package com.example.testspringboot.service;

import com.example.testspringboot.model.Component;

import java.util.List;

public interface ComponentService {

    void create(Component component);

    List<Component> readAll();

    Component read(int id);

    boolean update(Component component, int id);

    boolean delete(int id);
}
