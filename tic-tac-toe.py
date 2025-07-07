print("Welcome to tic tak toe game !...")

board = [
    ['','',''],
    ['','',''],
    ['','','']
    ]

def check_win(player):
    for i in range(3):
        if (board[0][i]==player and board[1][i]==player and board[2][i]==player) or(board[i][0]==player and board[i][1]==player and board[i][2]==player):
            return True
    
    return ((board[0][0]==player and board[1][1]==player and board[2][2]==player) or (board[0][2]==player and board[1][1]==player  and board[2][0]==player))
    
def start_game():
    
    
    curr_player ='x'
    moves = 0
    
    while True:
        print(board)
        print(f"current_player : {curr_player}")
        row = int(input())
        col = int(input())
        
        #validate
        if (row<0 or row>2) or (col<0 or col>2) or board[row][col]!='':
            print("please make a valid move")
            continue
        
        board[row][col] = curr_player
        
        if check_win(curr_player):
            print(f'{curr_player} wins !')
            break
        
        curr_player = 'o' if curr_player=='x' else 'x'
        moves = moves+1
        if(moves>=9):
            break
        
start_game()