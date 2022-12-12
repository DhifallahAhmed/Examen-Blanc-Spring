package tn.esprit.dhifallahahmed.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogginAspect {
    @AfterReturning("execution(void tn.esprit.dhifallahahmed.controller.ExamenController.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
		log.info("Out of method :" + name );
	}
}
