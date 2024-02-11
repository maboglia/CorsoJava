## application.properties

```java
spring.datasource.url=jdbc:mysql://localhost:3306/tss_2019?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect

spring.jpa.hibernate.ddl-auto=create
spring.jpa.hibernate.ddl-auto=create-drop


spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
spring.mvc.static-path-pattern=/resources/**
```

## Query custom nel DAO
```java
public interface IFilmInSalaDAO extends JpaRepository<FilmInSala, Integer> {

@Query("FROM FilmInSala where id_film = :id")
List<FilmInSala> findByFilm(@Param("id") int id);
}
```

## Formatta la data nel db
```java
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date data; 
```

## Crea una relazione con un altro model
```java
//2)creo relazioni col model dei cinema e dei film attraverso le chiavi esterne
@OneToOne
@JoinColumn(name="id_cinema") 
private Cinema cinema;
@OneToOne
@JoinColumn(name="id_film") 
private Film film;


	@PostMapping
	public ResponseEntity<Studente> utentePost(@Valid @RequestBody Studente s){
		
		return new ResponseEntity<Studente>(s, HttpStatus.CREATED);
		
	}
	@GetMapping("/studente/{pippo}")
	public Studente getStudente(@Valid @PathVariable("pippo") String nome) {
		
		Studente s = new Studente();
		s.setNome(nome);

		return s;
	}
```

---
```java

	@PostMapping("/libro")
	public String titolo(@RequestParam("titolo") String titolo, Model model) {
		model.addAttribute("titolo", titolo);
		return "libro";
	}
	
```


## Model, ModelMap, ModelAndView



Differences between Model, ModelMap, and ModelAndView

Model: It is an Interface. It defines a holder for model attributes and primarily designed for adding attributes to the model.

### Esempio:

```java
@RequestMapping(method = RequestMethod.GET)
    public String printHello(Model model) {
          model.addAttribute("message", "Hello World!!");
          return "hello";
       }
```

ModelMap: Implementation of Map for use when building model data for use with UI tools.Supports chained calls and generation of model attribute names.

### Esempio:

```java
@RequestMapping("/helloworld")
public String hello(ModelMap map) {
    String helloWorldMessage = "Hello world!";
    String welcomeMessage = "Welcome!";
    map.addAttribute("helloMessage", helloWorldMessage);
    map.addAttribute("welcomeMessage", welcomeMessage);
    return "hello";
}
```

ModelAndView: This class merely holds both to make it possible for a controller to return both model and view in a single return value.

### Esempio:

```java
@RequestMapping("/welcome")
public ModelAndView helloWorld() {
        String message = "Hello World!";
        return new ModelAndView("welcome", "message", message);
    }
```

