package com.teckacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KadaiFirstController {

    @GetMapping("/plus/{num1}/{num2}")
    public String calcPlus(@PathVariable int num1,@PathVariable int num2) {
        int result = 0;
        result = num1 + num2;
        return "実行結果：" + result;
    }
    @GetMapping("/minus/{num1}/{num2}")
    public String calcMinus(@PathVariable int num1,@PathVariable int num2) {
        int result = 0;
        result = num1 - num2;
        return "実行結果：" + result;
    }
    @GetMapping("/times/{num1}/{num2}")
    public String calcTimes(@PathVariable int num1,@PathVariable int num2) {
        int result = 0;
        result = num1*num2;
        return "実行結果：" + result;
    }
    @GetMapping("/devide/{num1}/{num2}")
    public String calcDivide(@PathVariable int num1,@PathVariable int num2) {
        int result = 0;
        result = num1/num2;
        return "実行結果：" + result;

    }
   @GetMapping("/dayofweek/{day}")
       public String dispDayOfWeek(@PathVariable String day ) {
       LocalDate localDate = LocalDate.parse(day, DateTimeFormatter.BASIC_ISO_DATE);
       DayOfWeek dayOfWeek =  localDate.getDayOfWeek();
       String result = dayOfWeek.toString();

       return "実行結果:" + result;
   }







}
