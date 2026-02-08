class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """

        # ✅ Check rows
        for r in range(9):
            if self.has_dup(board[r]):
                return False

        # ✅ Check columns
        for c in range(9):
            column = []
            for r in range(9):
                column.append(board[r][c])
            if self.has_dup(column):
                return False

        # ✅ Check 3×3 sub-boxes
        for box_row in range(0, 9, 3):
            for box_col in range(0, 9, 3):
                box = []
                for r in range(box_row, box_row + 3):
                    for c in range(box_col, box_col + 3):
                        box.append(board[r][c])

                if self.has_dup(box):
                    return False

        return True

    def has_dup(self, cells):
        seen = set()

        for value in cells:
            if value == '.':
                continue

            if value in seen:
                return True

            seen.add(value)

        return False
