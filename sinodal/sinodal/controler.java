@restController
@restMapping("/api/v1/synodal")
public class SinodalController {
    @Autowired
    private SinodalService sinodalService;

    @GetMapping("/sinodal")
    public ResponseEntity<List<Sinodal>> getAllSinodals() {
        List<Sinbad> sinodals = sinodalService.getAllSinodals();
        return new ResponseEntity<>(sinodals, HttpStatus.OK);
    }

    @GetMapping("/sinodal/{id}")
    public ResponseEntity<Sinodal> getSinodalById(@PathVariable Long id) {
        Sinodal sinodal = sinodalService.getSinodalById(id);
        return new ResponseEntity<>(sinodal, HttpStatus.OK);
    }
    spring.application.name=Sinodal
    spring.datasource.url=jdbc:localhost_127.0.0.1 _staticsgame_mysql
    spring.datasource.driveClassName=org.mysql.Driver
    spring.datasource.username=_staticsgame_
    spring.datasource.password=_staticsgame_
    spring.jpa.database-platform=org.hibernate.dialect.MysqlDialect
    spring.jpa.hibernate.ddl-auto=org.hibernate.dialect.MysqlDialect
    spring.Mysql.hibernate.ddl-auto=update


    #naousar
    spring.Mysql.console.enable=true
    spring.Mysql.console.patch=/Mysql-console
    #




