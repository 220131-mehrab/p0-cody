package com.revature.pokedex;


import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args){
        String webAppName = "pokedex";
        DexRepository dexRepository = new DexRepository("pokedex.csv");
        DexService dexService = new DexService(dexRepository);
        SearchFormService sfService = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.setPort(0);
        server.getConnector();
        server.addContext(webAppName, null);
        server.addServlet(webAppName, "defaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet(webAppName, "dexServlet", dexService).addMapping("/pokemon");
        server.addServlet(webAppName, "SearchFormServlet", sfService).addMapping("/search");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
