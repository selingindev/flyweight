import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class MonitoramentoSistema {

    private static final OperatingSystemMXBean osBean =
            (OperatingSystemMXBean) ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

    /**
     * Retorna as métricas atuais do sistema (CPU e memória real do processo)
     */
    public static MetricasSistema getMetricas() {
        double cpuProcesso = osBean.getProcessCpuLoad() * 100;
        double cpuSistema = osBean.getCpuLoad() * 100;

        // RAM total do sistema
        long memoriaTotal = osBean.getTotalPhysicalMemorySize();
        // RAM livre do sistema
        long memoriaLivre = osBean.getFreePhysicalMemorySize();
        // RAM usada pelo processo Java (comprometida)
        long memoriaJava = osBean.getCommittedVirtualMemorySize();

        double porcentagemMemoria = ((double) memoriaJava / memoriaTotal) * 100;

        return new MetricasSistema(cpuProcesso, cpuSistema, porcentagemMemoria);
    }

    /**
     * Classe interna que guarda as métricas
     */
    public static class MetricasSistema {
        private final double cpuProcesso;
        private final double cpuSistema;
        private final double memoriaUso;

        public MetricasSistema(double cpuProcesso, double cpuSistema, double memoriaUso) {
            this.cpuProcesso = cpuProcesso;
            this.cpuSistema = cpuSistema;
            this.memoriaUso = memoriaUso;
        }

        public double getCpuProcesso() { return cpuProcesso; }
        public double getCpuSistema() { return cpuSistema; }
        public double getMemoriaUso() { return memoriaUso; }

        @Override
        public String toString() {
            return String.format(
                    "CPU (proc): %.2f%% | CPU (sist): %.2f%% | RAM (proc): %.2f%%",
                    cpuProcesso, cpuSistema, memoriaUso);
        }
    }
}