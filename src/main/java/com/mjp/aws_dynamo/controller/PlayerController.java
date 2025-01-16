package com.mjp.aws_dynamo.controller;

import com.mjp.aws_dynamo.records.ScoreDTO;
import io.awspring.cloud.dynamodb.DynamoDbTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/players")
public class PlayerController {

    private DynamoDbTemplate dynamoDbTemplate;

    public PlayerController(DynamoDbTemplate dynamoDbTemplate) {
        this.dynamoDbTemplate = dynamoDbTemplate;
    }

    @PostMapping("/{username}/games")
    public ResponseEntity<Void> save( @PathVariable("username") String username,
            @RequestBody ScoreDTO score) {
    return ResponseEntity.ok().build();
    }

}
