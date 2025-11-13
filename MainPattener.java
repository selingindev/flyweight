import java.lang.management.ManagementFactory;

public class MainPattener {
    public static void main(String[] args) {
  
        Floresta floresta = new Floresta();
        com.sun.management.OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory
                .getOperatingSystemMXBean();
        floresta.arvores.clear();
        System.out.println("RAM total do sistema: " + osBean.getTotalPhysicalMemorySize() + " bytes");
        // do Pattener
        for (int i = 0; i < 5000000; i++) {
            double x = Math.random();
            double y = Math.random();
            floresta.plantarArvore(x, y, "Carvalho", "Verde", "carvalho.jpg");
            
            floresta.plantarArvore(x, y, "Pinheiro", "Verde Escuro",
                    "pinheiro.jpg");
        }

        

        System.out.println("Árvores plantadas: " + floresta.arvores.size());

        System.out.println("CPU load: " + osBean.getProcessCpuLoad() * 100 + "%");
        System.out.println("RAM usada pelo processo: " + osBean.getProcessCpuLoad() + " bytes");

        System.out.println("RAM livre do sistema: " + osBean.getFreePhysicalMemorySize() + " bytes");
    }
}
