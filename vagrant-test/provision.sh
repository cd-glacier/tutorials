
# neovim
sudo apt-get -y install software-properties-common
sudo add-apt-repository ppa:neovim-ppa/unstable
sudo apt-get -y update
sudo apt-get -y install neovim

# fish
sudo apt-get -y install fish

# setting
sudo git clone https://github.com/g-hyoga/dotfiles.git
sudo cp dotfiles/.tmux.conf /home/vagrant
sudo cp dotfiles/.config/nvim/init.vim /home/vagrant/.config/nvim
sudo cp dotfiles/.config/fish/config.fish /home/vagrant/.config/fish
git clone http://github.com/gmarik/vundle.git /home/vagrant/.config/nvim
