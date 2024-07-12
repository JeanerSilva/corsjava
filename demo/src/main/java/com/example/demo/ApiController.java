    package com.example.demo;

    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import jakarta.servlet.http.HttpServletResponse;

    @RestController
    @RequestMapping("/api")
    public class ApiController {

       // @CrossOrigin(origins = "*", exposedHeaders = "Allow")
        @GetMapping("/example")
        public String exampleEndpoint(HttpServletResponse response) {
            response.setHeader("Allow", "GET, POST, OPTIONS");
            response.setHeader("Access-Control-Expose-Headers", "Allow");
            return "Hello, world!";
        }
    }
