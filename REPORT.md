# Spring Boot Workshop

## Q 1.7 - When you click the green button, what does the IDE do before and while starting your application?
TODO

## Q 1.8 - What does Tomcat started on port 8080 (http) with context path `/` mean? Who installed Tomcat?
TODO

## Q 1.10 - What is the role of `@SpringBootApplication` and of `SpringApplication.run(...)`? (Hint: the annotation is a combination of three others – find them.)
TODO

`SpringApplication.run(...)` actually runs the webserver itself.

## Q 1.11 - After each code change you must restart the application, otherwise the change is not visible. Why?
Because every changed file needs to be recompiled to see changes.

## Q 2.3 - Which annotations do you need on the class and on the method? What happens “under the hood” when you add them? (See notes 1 and 2 below.)
We need to add:
- `@RestController` is an alias to `@Controller` and `@ResponseBody`, which indicate that the class is a controller, and should return web responses.
- `@RequestMapping("/programmers")` to define the path of our endpoint.
- `@GetMapping` on the method to register which function to call.

## Q 2.4 - We could have printed these three values in the main method instead. Why is this a bad idea? What risks do you see in putting code in the entry point?
It would violate the clean code principles, mainly the principles for functions, as well as making the code unreadable.

## Q 2.7 - Your method returns Java objects, yet the browser shows JSON. Who did the conversion, and when? (See note 3.)
*"Spring Boot uses HTTP message converters and Jackson to serialize Java objects into JSON automatically. The reverse mechanism  is used with @RequestBody"*

Since we use a `@RequestBody` with `@RestController`, there is an implicit JSON serializer used. 