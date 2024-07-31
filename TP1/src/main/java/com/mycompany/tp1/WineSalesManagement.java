package com.mycompany.tp1;

import java.util.Scanner;

public class WineSalesManagement {

    public static void main(String[] args) {
        int quantidade_tinto, quantidade_branco, n, quantidade_total, garrafas_artur, garrafas_berto, garrafas_carlos, quantidade_branco_total, quantidade_tinto_total, garrafas_artur_total, garrafas_berto_total, garrafas_carlos_total, maior_vendas;
        double percentagem_tinto, percentagem_branco, valor_medio_venda, valor_garrafas, valor_garrafas_carlos, valor_garrafas_carlos_total,valor_garrafas_artur_total, valor_garrafas_berto_total, valor_garrafas_berto, valor_garrafas_artur, maior_valor,  media_garrafas;
        String vendedor;
        String maior_vendas_nome;
        String maior_valor_nome;
        String tipo_de_vinho;

// inicializar as variáveis
        quantidade_total = 0;
        quantidade_branco_total = 0;
        quantidade_tinto_total = 0;
        garrafas_artur_total = 0;
        garrafas_berto_total = 0;
        garrafas_carlos_total = 0;
        valor_garrafas_artur = 0;
        valor_garrafas_berto = 0;
        valor_garrafas_carlos = 0;
        valor_garrafas_artur_total = 0;
        valor_garrafas_berto_total = 0;
        valor_garrafas_carlos_total = 0;
        
        

try (// leitura das variáveis (1) e cálculo da quantidade de garrafas vendidas (2)
        Scanner ler = new Scanner(System.in)) {
            System.out.println("Quantos dados irão ser inseridos?");

            n = ler.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Quem é o vendedor? (Artur, Berto, Carlos)");
                vendedor = ler.next().toLowerCase();
                while (!(vendedor.equals("artur") || vendedor.equals("berto") || vendedor.equals("carlos"))) {
                    System.out.println("Nome inválido, insira de novo.");
                    vendedor = ler.next().toLowerCase();
                }
                System.out.println("Que tipo de vinho foi vendido? (tinto/branco)");
                tipo_de_vinho = ler.next().toLowerCase();
                while (!(tipo_de_vinho.equals("tinto") || tipo_de_vinho.equals("branco"))) {
                    System.out.println("Tipo de vinho inválido, insira de novo.");
                    tipo_de_vinho = ler.next().toLowerCase();
                }

                if (vendedor.equals("artur")) {

                    if (tipo_de_vinho.equals("tinto")) {
                        System.out.println("Quantas garrafas foram vendidas?");
                        quantidade_tinto = ler.nextInt();
                        System.out.println("Qual foi o preço das garrafas?");
                        valor_garrafas = ler.nextDouble();
                        quantidade_total = quantidade_total + quantidade_tinto;
                        garrafas_artur = quantidade_tinto;
                        quantidade_tinto_total = quantidade_tinto_total + quantidade_tinto;
                        garrafas_artur_total = garrafas_artur_total + garrafas_artur;
                        valor_garrafas_artur = valor_garrafas;
                        valor_garrafas_artur_total = valor_garrafas_artur_total + valor_garrafas_artur ; 
                        
                    }

                    if (tipo_de_vinho.equals("branco")) {
                        System.out.println("Quantas garrafas foram vendidas?");
                        quantidade_branco = ler.nextInt();
                        System.out.println("Qual foi o preço das garrafas?");
                        valor_garrafas = ler.nextDouble();
                        quantidade_total = quantidade_total + quantidade_branco;
                        quantidade_branco_total = quantidade_branco_total + quantidade_branco;
                        valor_garrafas_artur = valor_garrafas;
                        valor_garrafas_artur_total = valor_garrafas_artur_total + valor_garrafas_artur ;
                        

                    }
                }

                if (vendedor.equals("berto")) {

                    if (tipo_de_vinho.equals("tinto")) {
                        System.out.println("Quantas garrafas foram vendidas?");
                        quantidade_tinto = ler.nextInt();
                        System.out.println("Qual foi o preço das garrafas?");
                        valor_garrafas = ler.nextDouble();
                        quantidade_total = quantidade_total + quantidade_tinto;
                        garrafas_berto = quantidade_tinto;
                        quantidade_tinto_total = quantidade_tinto_total + quantidade_tinto;
                        garrafas_berto_total = garrafas_berto_total + garrafas_berto;
                        valor_garrafas_berto = valor_garrafas;
                        valor_garrafas_berto_total = valor_garrafas_berto_total + valor_garrafas_berto ;
                        
                    }

                    if (tipo_de_vinho.equals("branco")) {
                        System.out.println("Quantas garrafas foram vendidas?");
                        quantidade_branco = ler.nextInt();
                        System.out.println("Qual foi o preço das garrafas?");
                        valor_garrafas = ler.nextDouble();
                        quantidade_total = quantidade_total + quantidade_branco;
                        quantidade_branco_total = quantidade_branco_total + quantidade_branco;
                        valor_garrafas_berto = valor_garrafas;
                        valor_garrafas_berto_total = valor_garrafas_berto_total + valor_garrafas_berto ;
                        
                    }
                }

                if (vendedor.equals("carlos")) {

                    if (tipo_de_vinho.equals("tinto")) {
                        System.out.println("Quantas garrafas foram vendidas?");
                        quantidade_tinto = ler.nextInt();
                        System.out.println("Qual foi o preço das garrafas?");
                        valor_garrafas = ler.nextDouble();
                        quantidade_total = quantidade_total + quantidade_tinto;
                        garrafas_carlos = quantidade_tinto;
                        quantidade_tinto_total = quantidade_tinto_total + quantidade_tinto;
                        garrafas_carlos_total = garrafas_carlos_total + garrafas_carlos;
                        valor_garrafas_carlos = valor_garrafas;
                        valor_garrafas_carlos_total = valor_garrafas_carlos_total + valor_garrafas_carlos ;
                        
                    }

                    if (tipo_de_vinho.equals("branco")) {
                        System.out.println("Quantas garrafas foram vendidas?");
                        quantidade_branco = ler.nextInt();
                        System.out.println("Qual foi o preço das garrafas?");
                        valor_garrafas = ler.nextDouble();
                        quantidade_total = quantidade_total + quantidade_branco;
                        quantidade_branco_total = quantidade_branco_total + quantidade_branco;
                        valor_garrafas_carlos = valor_garrafas;
                        valor_garrafas_carlos_total = valor_garrafas_carlos_total + valor_garrafas_carlos ;

                    }
                }
            }
        }
        // cálculo das percentagens de branco e tinto (3)
        percentagem_tinto = ((quantidade_tinto_total * 100) / (double) quantidade_total);
        percentagem_branco = ((quantidade_branco_total * 100) / (double) quantidade_total);

// cálculo do maior vendedor de tinto (4)
        if (garrafas_artur_total > garrafas_berto_total) {
            maior_vendas = garrafas_artur_total;
            maior_vendas_nome = "Artur";

        } else {
            maior_vendas = garrafas_berto_total;
            maior_vendas_nome = "Berto";
        }

        if (garrafas_carlos_total > maior_vendas) {
            maior_vendas = garrafas_carlos_total;
            maior_vendas_nome = "Carlos";
        }
        
// cálculo do vendedor que realizou a maior venda (5)
        if (valor_garrafas_artur > valor_garrafas_berto) {
            maior_valor = valor_garrafas_artur;
            maior_valor_nome = "Artur";
        } else {
            maior_valor = valor_garrafas_berto;
            maior_valor_nome = "Berto";
        }
        if (valor_garrafas_carlos > maior_valor) {
            maior_valor = valor_garrafas_carlos;
            maior_valor_nome = "Carlos";
        }
// cálculo do valor médio por venda (7)
        valor_medio_venda = ((valor_garrafas_artur_total + valor_garrafas_berto_total + valor_garrafas_carlos_total) / n);
// cálculo da quantidade média de garrafas por venda (6)        
        media_garrafas = ((quantidade_total) / n);

// resultado da quantidade total (2)        
        System.out.println("Quantidade total de garrafas vendidas = " + quantidade_total);
// resultado da percentagem de tinto ou branco (3)        
        System.out.println("Percentagem de vinho branco = " + String.format("%.2f", percentagem_branco) + "%");
        System.out.println("Percentagem de vinho tinto = " + String.format("%.2f", percentagem_tinto) + "%");
// resultado do vendedor que mais garrafas de tinto vendeu (4)        
        System.out.println("O vendedor que vendeu mais garrafas de vinho tinto foi o " + maior_vendas_nome + " e vendeu " + maior_vendas + " garrafas.");
// resultado do vendedor que realizou a venda de maior valor (5)        
        System.out.println("O vendedor que realizou venda de maior valor foi o " + maior_valor_nome + " no valor de " + maior_valor + "€.");
// resultado da quantidade média de garrafas por venda (6)
        System.out.println("Quantidade média de garrafas por venda = " + String.format("%.1f",media_garrafas));
// resultado do valor médio por venda (7)
        System.out.println("O valor médio por venda é " + String.format("%.1f", valor_medio_venda) + "€.");
    }
}