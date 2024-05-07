package DesafioDois;

import java.util.Scanner;

public class Main {
    
    static ListaEmpregados listaEmpregados = new ListaEmpregados();
    Empregado empregado = null;
    Empregado usuario = new Empregado();
    Boolean flag = true, adm = true;


    void login(){
        String user;
        String senha;

        System.out.println("-------LOGIN-------");

        System.out.println("User: ");
        Scanner log = new Scanner(System.in);
        user = log.nextLine();
        log.close();

        System.out.println("Senha: ");
        Scanner password = new Scanner(System.in);
        senha = password.nextLine();
        password.close();

        for(int i = 0; i < listaEmpregados.getSize() ; i++){
            
            empregado = listaEmpregados.getEmpregados(i);

            if(user.equals(empregado.getCpf()) && senha.equals(empregado.getSenha())){
                System.out.println("Login bem sucedido!");
                flag = true;
            
                if (empregado.getAdm() != true) {
                    adm = false;

                }
                else{
                    funcaoAdm();
                }
                
                break;
            }
            else {
                System.out.println("Login inválido");
            }
        }

    }


    void funcaoAdm(){
    System.out.println("1 - Bater Ponto\n2 - Cadastrar novo empregado");
    Scanner scanner = new Scanner(System.in);
    Integer input = scanner.nextInt();

    switch (input) {
        case 1:
            
            break;
    
        case 2:
            System.out.println("Nome empregado: ");
            // scanner = new Scanner(System.in);
            String nomeEmpregado = scanner.nextLine();

            System.out.println("CPF do empregado: ");
            String cpfEmpregado = scanner.nextLine();

            System.out.print("Data de nascimento: ");
            String dataNascEmpregado = scanner.nextLine();

            System.out.print("Senha empregado: ");
            String senhaEmpregado = scanner.nextLine();

            System.out.print("O novo empregado é Admin? Digite:\n1 - SIM \n0 - NÃO ");
            Boolean tipoEmpregado = scanner.nextBoolean();

            Empregado newEmpregado = new Empregado();
            newEmpregado.novoEmpregado(nomeEmpregado, cpfEmpregado, dataNascEmpregado,senhaEmpregado,tipoEmpregado);
            listaEmpregados.add(newEmpregado);

            break;
    }
   }

   void baterPonto(){
    System.out.println("Digite a hora atual:");
    Scanner scanner = new Scanner(System.in);
    Integer horaPonto = scanner.nextInt();

    System.out.println("Digite os minutos: ");
    Integer minutosPonto = scanner.nextInt();

    System.out.println("Digite a data de hoje: ");
    String dataPonto = scanner.nextLine();

    
   }
}
