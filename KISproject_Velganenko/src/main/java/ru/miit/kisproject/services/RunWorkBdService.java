package ru.miit.kisproject.services;

import ru.miit.kisproject.mapper.GroupMapper;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class RunWorkBdService {
    @Autowired
    GroupMapper groupMapper;

    @Autowired
    DataStorage dataStorage;

    @Scheduled(fixedDelay = 10 * 24 * 60 * 60000)
    void run() {
        List<Groups> groupList = groupMapper.selectAll();
        List<Groups> filteredvivsdAsoupPOperList = groupList.parallelStream().filter((kodOp) -> {
            return Objects.equals(kodOp.getGroupName(), "УИС-411");
        }).collect(Collectors.toList());
        dataStorage.getGroupList().addAll(groupList);
    }
}
