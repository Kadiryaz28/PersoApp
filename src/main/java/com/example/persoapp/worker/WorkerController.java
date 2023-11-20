package com.example.persoapp.worker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WorkerController {
        @GetMapping("/registerWorker")
        public String showForm(Model model) {
            Worker worker = new Worker();
            model.addAttribute("worker", worker);

            List<String> listProfession = Arrays.asList("Helfer", "Elektrohelfer", "Elektromeister");
            model.addAttribute("Beruf", listProfession);

            return "registerWorker";
        }

        @PostMapping("/registerWorker")
        public String submitForm(@ModelAttribute("worker") Worker worker) {
            System.out.println(worker);
            return "redirect:/dashboard";
        }
    }
