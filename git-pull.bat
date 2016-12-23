@echo off

echo "to current drive: %~d0"
%~d0

echo "to current directory: %cd%"
cd %cd%

echo "execute git fetch origin..."
git fetch origin

echo "execute git merge origin/develop..."
git merge origin/develop
