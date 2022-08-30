def newgit(repo)
{
  git "${repo}"
}

def newbuild()
{
  sh 'mvn package'
}

def newdeploy(jobname,ip,appname)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}

def newtest(jobname)
{
  sh "sh 'java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
