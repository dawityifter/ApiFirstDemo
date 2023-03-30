package com.dawityifter.trail.apifirst.controller;

import com.dawityifter.trail.apifirst.api.PetsApi;
import com.dawityifter.trail.apifirst.service.DebitService;
import com.dawityifter.trail.apifirst.service.CreditService;
import com.dawityifter.trail.apifirst.api.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import com.dawityifter.trail.apifirst.model.*;
import java.util.List;
@RestController
@Slf4j
@AllArgsConstructor
public class PetsController implements PetsApi {
     private final DebitService debitService;
     private final CreditService creditService;
   @Override
   public Mono<ResponseEntity<CreditResponse> authorize(CreditRequest creditRequest, ServerWebExchange exchange){
       
       return creditService.authorize(crediRequest).map(creditAuthResponse -> ResponseEntity.ok().body(creditAuthResponse);
   }
   


}
