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

## Q 3.1 - Before configuring anything, restart the application. It fails. Read the error message carefully: what is Spring Boot trying to do that it could not? What does that tell you about what a starter does?
Spring Boot can't access the database, and therefore find an appropriate driver, because we haven't given it the URL to the database.

## Q 3.2 - Stop for a moment and look at import jakarta.persistence.*;. Where does this package come from? Which dependency brought it into your project? Why jakarta and not javax, as you will see in older tutorials?
TODO

## Q 3.3 - What is the difference between your first Programmer (a POJO) and this one? Which table and which columns does Hibernate map lastName and favoriteBook to, and why does it work without any @Table or @Column(name=...)?
TODO

## Q 3.4 - This interface has no body and no implementation class, yet it offers findAll(), findById(), save(), deleteById()… Where do these methods come from? Who creates the implementation at runtime?
These functions come from `JpaRepository`.

## Q 3.5 - You will often see another style: `@Autowired private ProgrammerRepository repo;` in the code you will encounter on the field. Why do we prefer constructor injection?
TODO

## Q 4.1 - PUT and PATCH can both “modify” a resource. What is the difference ? Which one fits this operation better? Be ready to justify your choice.
HTTP PUT request is used to replace and update the entire resource or document, while the PATCH request only updates the specific parts of that document.

## Q 4.2 - Research @Transactional. On which methods of the service layer does it make sense – and on which does it not? What happens “under the hood” when you add it? Why does it matter most for the update operation?
"When this annotation is declared at the class level, it applies as a default to all methods of the declaring class and its subclasses."