package com.wei.example.rest;

import com.google.json.JsonSanitizer;
import com.wei.example.common.vo.GovHolidayRequestVO;
import com.wei.example.service.intf.GovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class GovRest extends AbstractRest {

    @Autowired
    private GovService govService;

    @GetMapping("/getHolidayByYear")
    public ResponseEntity<?> getHolidayByYear_get(@RequestParam String year) {
        String methodName = "getHolidayByYear_get()";
        logger.info("{} {} start. year: {}", LOG_CLASS_PREFIX, methodName, year);

        return ResponseEntity.status(HttpStatus.OK)
                .body(govService.getHolidayByYear(year));
    }

    @PostMapping(value = "/getHolidayByYear", consumes = "application/json")
    public ResponseEntity<?> getHolidayByYear_post(@RequestBody String payload) {
        String methodName = "getHolidayByYear_post()";
        logger.info("{} {} start. payload: {}", LOG_CLASS_PREFIX, methodName, payload);

        GovHolidayRequestVO requestVO = gson.fromJson(JsonSanitizer.sanitize( payload ), GovHolidayRequestVO.class);
        return ResponseEntity.status(HttpStatus.OK)
                .body(govService.getHolidayByYear(requestVO.getYear().toString()));
    }
}