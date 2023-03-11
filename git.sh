if [ $# -eq 1 ]
then
  message=$1
else
  message="commit"
fi

echo 提交信息为:$message

git add .
git commit -m $message
git push -u gitee main
git push -u github main