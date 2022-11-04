package src.Dominio;

import src.DominioFabrica.Acessorios;
import src.DominioPcFabrica.CPU;
import src.DominioPcFabrica.HD;
import src.DominioPcFabrica.Memoria;
import src.DominioPcFabrica.SO;
import src.Facade.ComputerFacade;

public class Main {

    public static void main(String[] args){
    ComputerFacade facade = new ComputerFacade();
    facade.montarPC();
    }

//  public static void main(String[] args) {
//     Memoria memoria = new Memoria();
//     memoria.adicionarMemoria();

//     HD hd = new HD();
//     hd.adicionarHD();

//     CPU cpu = new CPU();
//     cpu.adicionaProcessador();

//     Acessorios acessorios = new Acessorios();
//     acessorios.adicionarMouse();
//     acessorios.adicionarTeclado();
//     acessorios.adicionarMonitor();
    
//     SO so = new SO();
//     so.instalarSO();
    
//  }   
}
