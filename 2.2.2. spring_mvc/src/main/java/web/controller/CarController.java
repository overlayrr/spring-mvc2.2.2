package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;

import static web.servise.ServiseCar.getCars;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String print(@RequestParam(value = "locale", required = false) String locale, ModelMap model) {
        List<Car> cars = getCars();
        String titleOfTheTable = "CARS";

        if (locale != null) {
            if (locale.equals("ru")) {
                titleOfTheTable = "МАШИНЫ";
            } else if (locale.equals("en")) {
                titleOfTheTable = "CARS";
            }
        }

        System.out.println("title = " + titleOfTheTable);
        model.addAttribute("cars", cars);
        model.addAttribute("title", titleOfTheTable);
        return "cars";

    }
}