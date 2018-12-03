package webservice.scheduledtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(fixedDelay = 5000)
    public void repportCurrentTime() {
        log.info("The time is now {}", LocalDateTime.now());
    }
}

