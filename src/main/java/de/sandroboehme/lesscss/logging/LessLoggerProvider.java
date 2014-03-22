package de.sandroboehme.lesscss.logging;

interface LessLoggerProvider {
    LessLogger getLogger(Class<?> clazz);
}
