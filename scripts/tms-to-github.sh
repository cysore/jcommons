# !/bin/bash
cd /opt/github/penging-codes-tms/

echo "git fetch origin"
/opt/git/bin/git fetch origin

echo "git merge origin/dev"
/opt/git/bin/git merge origin/dev

echo "git fetch tms"
/opt/git/bin/git fetch tms

echo "git merge tms/dev"
/opt/git/bin/git merge tms/dev

echo "git push origin dev"
/opt/git/bin/git push origin dev

