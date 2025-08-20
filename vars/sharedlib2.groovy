[ #repo mentioned in the 1st line will that repo where (Hello.py) or {all the files have been stored or to be downloaded} will the written, i.e in this case in the Git-Aug-25 repo, I'm having Hello.py file have been stored. ]


def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Heyyprakhar1/${repo}.git"
}
def build()
{
  sh 'python3'
}
def deployement(jobname,ip){
  sh "scp /var/lib/jenkins/workspace/${jobname}/Hello.py ubuntu@${ip}:/home/ubuntu/new-folder"
}
def testing(jobname){
  sh "python3 /var/lib/jenkins/workspace/${jobname}/Hello.py" 
}
def release(jobname, ip){
 sh "scp /var/lib/jenkins/workspace/${jobname}/Hello.py ubuntu@${ip}:/home/ubuntu/new-folder" 
}
