source ~/.git-prompt.sh
PS1='\[\e[01;32m\]\u@\H \[\e[01;34m\]\w\[\e[00m\]$(__git_ps1 " [%s $(git rev-parse --short HEAD 2>/dev/null)]") \$ '