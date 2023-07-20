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

Ver lista de configuraciones del usuario
```cmd
git config --list
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

Enviar etiqueta al repositorio remoto
```cmd
git push origin <nombre_etiqueta>
```

Enviar etiquetas en conjunto al repositorio remoto
```cmd
git push origin --tags
```

Verificar remotos existentes
```cmd
git remote -v
```

Eliminar repositorio remoto no deseado
```cmd
git remote remove <nombre_repositorio>
```

Desoonectar repositorio remoto
```cmd
git remote rm origin
```

Verificar claves SSH existente
```cmd
ls ~/.ssh
```

Generar una nueva clave SSH
```cmd
ssh-keygen -t ed25519 -C "your_email@example.com"
```

Iniciar agente de autenticación
```cmd
eval "$(ssh-agent)"
```

Agregar clave privada al proyecto
```cmd
ssh-add ~/.ssh/<clave_privada>
```


