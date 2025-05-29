package com.sinodal.controller;
import lombok.RequiredArgsConstructor;

@Restcontroller
@Requestmapping("/api")
@requiredargsConstructor

public class apicontroller {
    private final queveryservice queryService;
    private final queveProcessorService queueProcessorService;
    

    @PostMapping("/atleta/insert/{nome}/{idade}{posicao}")
    public ResponseEntity<String> AtletaPost(
        @PathVariable String nome,
        @PathVariable long idade,
        @PathVariable(required = false) String posicao,
        @RequestBody(required = false) String nome{
            String posicao = posicao != null ? posicao : "";
            Atleta atleta = new Atleta(nome, idade, posicao);
            
            return ResponseEntity.accepted().body("" + atleta.getNome() + " " + atleta.getIdade() + " " + atleta.getPosicao());
        }
    )
}

    @PostMapping("/Formação/insert/{formacao}")
    public ResponseEntity<String> FormaçãoPost(
        @PathVariable long Formação,
        @RequestBody(required = false) String nome{
            String Formação = Formação != null ? Formação : "";
            Formação formação = new Formação(Formação);
            
            return ResponseEntity.accepted().body("" + formação.getFormação());
        }
    )
}

    @PostMapping("/Treinadores/insert/{nome}/{idade}{formacao}")
    public ResponseEntity<String> TreinadoresPost(
        @PathVariable String nome,
        @PathVariable long idade,
        @PathVariable int formacao,
        @RequestBody(required = false) String nome{
            Int formacao = formacao != null ? formacao : "";
            Treinadores treinadores  = new Treinadores(nome, idade, formacao);
            
            return ResponseEntity.accepted().body("" + treinadores.getNome() + " " + treinadores.getIdade() + " " + treinadores.getFormacao());
        }
    )
}

  @PostMapping("/Clubesdomundo/insert/{nome}/{idade}/{titulos}")
    public ResponseEntity<String> Clubesdomundo(
        @PathVariable String nome,
        @PathVariable long idade,
        @PathVariable int titulos,
        @RequestBody(required = false) String nome{
            String titulos = titulos != null ? titulos : "";
            Clubesdomundo clubesdomundo  = new Clubesdomundo(nome, idade, titulos);
            
            return ResponseEntity.accepted().body("" + treinadores.getNome() + " " + treinadores.getIdade() + " " + treinadores.getTitulos());
        }
    )
}

@PostMapping("/Campeonatos/insert/{nome}/{ano}/{local}")
public ResponseEntity<String> CampeonatosPost(
        @PathVariable String nome,
        @PathVariable int ano,
        @PathVariable String local,
        @RequestBody(required = false) String nome{
            String local = local != null ? local : "";
            Campeonatos campeonatos = new Campeonatos(nome, ano, local);
            
            return ResponseEntity.accepted().body("" + campeonatos.getNome() + " " + campeonatos.getAno() + " " + campeonatos.getLocal());
        }
    )