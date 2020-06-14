package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        List<Item> itens = new ArrayList<Item>();

        String url = "http://www4.fazenda.rj.gov.br/consultaNFCe/QRCode?p=33200431487473006200650080001615921415730744|2|1|2|5d32e631c69aa9564236d26d7b0965b5dc94f929";
        System.setProperty("webdriver.chrome.driver", "/Users/rrgayer/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get(url);

        WebElement empresa = driver.findElement(By.id("u20"));

        System.out.println("***************************************");
        System.out.println("Empresa = " + empresa.getText());
        System.out.println("***************************************");

        WebElement chaveAcessoWeb = driver.findElement(By.className("chave"));

        WebElement table = driver.findElement(By.id("tabResult"));

        List<WebElement> lines = table.findElements(By.tagName("tr"));

        for (WebElement line : lines) {

            Item item = new Item();

            item.setChaveDeAcesso(chaveAcessoWeb.getText());

            WebElement produtoWeb = line.findElement(By.className("txtTit"));
            WebElement quantidadeWeb = line.findElement(By.className("Rqtd"));
            WebElement codigoWeb = line.findElement(By.className("RCod"));
            WebElement unidadeWeb = line.findElement(By.className("RUN"));
            WebElement ValorUnitarioWeb = line.findElement(By.className("RvlUnit"));
            WebElement ValorTotalWeb = line.findElement(By.className("valor"));

            String quantidade = quantidadeWeb.getText();
            quantidade = quantidade.replace("Qtde.:","");

            String codigo = codigoWeb.getText();
            codigo = codigo.replace("(Código: ","");
            codigo = codigo.replace(")","");

            String valorUnitario = ValorUnitarioWeb.getText();
            valorUnitario = valorUnitario.replace("Vl. Unit.:","");
            valorUnitario = valorUnitario.replaceAll(" ","");

            String unidade = unidadeWeb.getText();
            unidade = unidade.replace("UN:","");
            unidade = unidade.replaceAll(" ","");

            item.setCodigo(codigo);
            item.setProduto(produtoWeb.getText());
            item.setUnidade(unidade);
            item.setQuantidade(quantidade);
            item.setValorUnitário(valorUnitario);
            item.setValorTotal(ValorTotalWeb.getText());

            itens.add(item);

        }
        for (Item item : itens) {
            System.out.println(item.toString());
        }
        System.out.println("***************************************");
    }
}
