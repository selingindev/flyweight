import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

import semPattener.ArvoreNP;

public class Main {
        public static void main(String[] args) throws InterruptedException {

                List<ArvoreNP> arvoresNP = new ArrayList<>();

                com.sun.management.OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory
                                .getOperatingSystemMXBean();

                arvoresNP.clear();
                System.out.println("RAM total do sistema: " + osBean.getTotalPhysicalMemorySize() + " bytes");

                for (int i = 0; i < 5000000; i++) {
                        double x = Math.random();
                        double y = Math.random();

                        ArvoreNP arvoreCarvalho = new ArvoreNP("Carvalho", "Marrom clara",
                                        "textureCarvalho.jpg", x, y);
                        ArvoreNP arvoreJungle = new ArvoreNP("Jungle", "Marrom escuro",
                                        "textureJungle.jpg", x, y);
                        System.out.print(arvoreCarvalho);
                        System.out.print(arvoreJungle);
                        arvoresNP
                                        .add(arvoreCarvalho);

                        arvoresNP
                                        .add(arvoreJungle);
                }
                System.out.println("Árvores plantadas: " + arvoresNP.size());

                System.out.println("CPU load: " + osBean.getProcessCpuLoad() * 100 + "%");
                System.out.println("RAM usada pelo processo: " + osBean.getProcessCpuLoad() + " bytes");

                System.out.println("RAM livre do sistema: " + osBean.getFreePhysicalMemorySize() + " bytes");
        }

}
