package ru.miit.kisproject.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.Groups;

import java.util.List;


@RestController
@RequestMapping("/kis")
@Tag(name = "Сервис КИС", description = "Группы ..")
public class KisController {

    @Autowired
    DataStorage dataStorage;

    @Operation(
            summary = "Группы",
            description = "Сервис возвращает список групп"
    )
    @GetMapping(value = "/groups", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Groups> getGroups(){
        return dataStorage.getGroupList();
    }
}

