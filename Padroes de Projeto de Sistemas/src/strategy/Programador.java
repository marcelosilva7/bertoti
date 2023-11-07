package Strategy;

public class Programador {


    private Programar programar;

    public void setProgramar(Programar pro){
        programar = pro;
    }

    public void realizarProgramar(){
        programar.programar();
    }




}
