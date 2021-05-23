package com.deepjin.fox.controller;

import com.deepjin.fox.dao.Member;
import com.deepjin.fox.dto.MemberDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@Api(tags = "back-front 간 rest api 테스트 ")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    ResponseEntity<?> entity = null;

    @ApiOperation(value = "사용자 정보 ", tags = "tags 부분")
    @GetMapping(value="/member")
    public ResponseEntity<?> registerMember(String id, String name, String email) {
        Member member = new Member();
        member.setId(id);
        member.setName(name);
        member.setEmail(email);
        entity = new ResponseEntity<Member>(member, HttpStatus.OK);

        return entity;
    }



}
