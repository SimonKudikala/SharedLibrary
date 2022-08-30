def newgit(repo)
{
  git "${repo}"
}

def newbuild()
{
  sh 'mvn package'
}
