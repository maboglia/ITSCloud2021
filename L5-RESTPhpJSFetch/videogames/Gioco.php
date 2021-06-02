<?php

class Gioco {

    public $id;
    public $nome;
    public $genere;
    public $valutazione;

    public function __construct($id, $nome, $genere, $valutazione)
    {
        $this->id = $id;
        $this->nome = $nome;
        $this->genere = $genere;
        $this->valutazione = $valutazione;
    }

}



?>