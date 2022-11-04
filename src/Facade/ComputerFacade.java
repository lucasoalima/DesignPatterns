package src.Facade;

import src.DominioPcFabrica.Memoria;
import src.DominioFabrica.Acessorios;
import src.DominioPcFabrica.CPU;
import src.DominioPcFabrica.SO;
import src.DominioPcFabrica.HD;

public class ComputerFacade {
    
    private Memoria memoria;
    private CPU cpu;
    private SO so;
    private Acessorios acessorios;
    private HD hd;

    public ComputerFacade(){
        
        this.memoria = new Memoria();
        this.hd = new HD();
        this.acessorios = new Acessorios();
        this.so = new SO();
        this.cpu = new CPU();
    }
    public void montarPC() {
            
            System.out.println("Montando uma nova máquina...\n");
            // Memoria memoria = new Memoria();
            memoria.adicionarMemoria();
        
            // HD hd = new HD();
            hd.adicionarHD();
        
            // CPU cpu = new CPU();
            cpu.adicionaProcessador();
        
            // Acessorios acessorios = new Acessorios();
            acessorios.adicionarMouse();
            acessorios.adicionarTeclado();
            acessorios.adicionarMonitor();
            
            // SO so = new SO();
            so.instalarSO();
            
           System.out.println("\nComputador fabricado");

    }
}
