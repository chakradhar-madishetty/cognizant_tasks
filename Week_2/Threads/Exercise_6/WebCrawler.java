package Week_2.Threads.Exercise_6;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WebCrawler {
    private static final int NUM_THREADS = 5;
    private static final ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
    private static final ConcurrentHashMap<String, String> crawledData = new ConcurrentHashMap<>();
    private static final AtomicInteger pendingTasks = new AtomicInteger(0);

    public static void main(String[] args) {
        String[] urls = {
            "http://example.com/page1",
            "http://example.com/page2",
            "http://example.com/page3"
        };

        for (String url : urls) {
            pendingTasks.incrementAndGet();
            executorService.submit(new CrawlerTask(url));
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("Crawled Data:");
        for (Map.Entry<String, String> entry : crawledData.entrySet()) {
            System.out.println("URL: " + entry.getKey() + " - Content: " + entry.getValue());
        }
    }

    private static class CrawlerTask implements Runnable {
        private final String url;

        public CrawlerTask(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000); 

                String content = "Content of " + url;

                crawledData.put(url, content);

                System.out.println("Crawled: " + url);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Crawler task interrupted for URL: " + url);
            } finally {
                if (pendingTasks.decrementAndGet() == 0) {
                    System.out.println("All tasks completed.");
                }
            }
        }
    }
}
