def newgit(repo)
{
  git "${repo}"
}

def newbuild()
{
  sh 'mvn package'
}

def(jobname,ip,appname)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war'
}
