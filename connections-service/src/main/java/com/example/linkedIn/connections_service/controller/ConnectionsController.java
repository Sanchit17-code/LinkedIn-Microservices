package com.example.linkedIn.connections_service.controller;

import com.example.linkedIn.connections_service.entity.Person;
import com.example.linkedIn.connections_service.service.ConnectionsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/core")
@RequiredArgsConstructor
@Slf4j
public class ConnectionsController {

    private final ConnectionsService connectionsService;

    @GetMapping("/first-degree")
    public ResponseEntity<List<Person>> getFirstConnections() {
        log.info("Request came in to the connections controller for getting first degree connection");
        return ResponseEntity.ok(connectionsService.getFirstDegreeConnections());
    }
}
