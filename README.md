# Biblioteca - Api - SpringBoot

---

## Comandos git

Ver datos del usuario asociados a git
```cmd
git config user.email
git config user.name
```

Configurar correo y nombre de manera global
```cmd
git config --global user.email "tucorreo@ejemplo.com"
git config --global user.name "Tu Nombre"
```

Configurar correo y nombre para el proyecto
```cmd
git config user.email "tucorreo@ejemplo.com"
git config user.name "Tu Nombre"
```

Ver historial de commits 
```cmd
git log --oneline
```

Crear etiqueta ligera
```cmd
git tag <nombre_etiqueta>"
```

Crear etiqueta anotada
```cmd
git tag -a <nombre_etiqueta> -m "Mensaje de la etiqueta"
```

Ver etiquetas existentes
```cmd
git tag
```

Ver información detallada de la etiqueta 
```cmd
git show <nombre_etiqueta>
```

Enviar etiquetas al repositorio remoto
```cmd
git push origin <nombre_etiqueta>
```

